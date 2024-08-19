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

public val LightGroup.Hashstraight: ImageVector
    get() {
        if (_hashstraight != null) {
            return _hashstraight!!
        }
        _hashstraight = Builder(name = "Hashstraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 154.0f)
                lineTo(166.0f, 154.0f)
                lineTo(166.0f, 102.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(166.0f, 90.0f)
                lineTo(166.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(154.0f, 90.0f)
                lineTo(102.0f, 90.0f)
                lineTo(102.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(90.0f, 90.0f)
                lineTo(40.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(90.0f, 102.0f)
                verticalLineToRelative(52.0f)
                lineTo(40.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(90.0f, 166.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(102.0f, 166.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 166.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(102.0f, 154.0f)
                lineTo(102.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _hashstraight!!
    }

private var _hashstraight: ImageVector? = null
