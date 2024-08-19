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

public val LightGroup.Legosmiley: ImageVector
    get() {
        if (_legosmiley != null) {
            return _legosmiley!!
        }
        _legosmiley = Builder(name = "Legosmiley", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 122.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 100.0f, 122.0f)
                close()
                moveTo(156.0f, 102.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 102.0f)
                close()
                moveTo(152.8f, 146.92f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, true, -49.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, 10.16f)
                arcToRelative(59.0f, 59.0f, 0.0f, false, false, 62.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.4f, -10.16f)
                close()
                moveTo(214.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, true, -24.0f, 29.4f)
                lineTo(190.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(80.0f, 238.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(66.0f, 205.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, true, 42.0f, 176.0f)
                lineTo(42.0f, 80.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 72.0f, 50.0f)
                lineTo(90.0f, 50.0f)
                lineTo(90.0f, 32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                lineTo(166.0f, 50.0f)
                horizontalLineToRelative(18.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 214.0f, 80.0f)
                close()
                moveTo(102.0f, 50.0f)
                horizontalLineToRelative(52.0f)
                lineTo(154.0f, 32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(104.0f, 30.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(178.0f, 224.0f)
                lineTo(178.0f, 206.0f)
                lineTo(78.0f, 206.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(96.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 178.0f, 224.0f)
                close()
                moveTo(202.0f, 80.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                lineTo(72.0f, 62.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 54.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                lineTo(184.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _legosmiley!!
    }

private var _legosmiley: ImageVector? = null
