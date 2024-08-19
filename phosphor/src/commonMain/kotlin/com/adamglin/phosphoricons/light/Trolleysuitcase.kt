package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Trolleysuitcase: ImageVector
    get() {
        if (_trolleysuitcase != null) {
            return _trolleysuitcase!!
        }
        _trolleysuitcase = Builder(name = "Trolleysuitcase", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 158.0f)
                lineTo(216.0f, 158.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(182.0f, 58.0f)
                lineTo(182.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(136.0f, 26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                lineTo(122.0f, 58.0f)
                lineTo(88.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.0f, 72.0f)
                verticalLineToRelative(72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.0f, 158.0f)
                close()
                moveTo(134.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(170.0f, 58.0f)
                lineTo(134.0f, 58.0f)
                close()
                moveTo(86.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 70.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(88.0f, 146.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(86.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 86.0f, 224.0f)
                close()
                moveTo(230.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 224.0f)
                close()
                moveTo(246.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(42.0f, 178.0f)
                lineTo(42.0f, 75.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.41f)
                lineTo(19.76f, 52.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineTo(49.9f, 65.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, 4.1f, 9.9f)
                lineTo(54.0f, 178.0f)
                lineTo(240.0f, 178.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 184.0f)
                close()
            }
        }
        .build()
        return _trolleysuitcase!!
    }

private var _trolleysuitcase: ImageVector? = null
