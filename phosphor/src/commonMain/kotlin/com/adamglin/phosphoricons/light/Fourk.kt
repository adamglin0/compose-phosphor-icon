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

public val LightGroup.FourK: ImageVector
    get() {
        if (_fourK != null) {
            return _fourK!!
        }
        _fourK = Builder(name = "FourK", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(224.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 54.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 48.0f)
                close()
                moveTo(224.0f, 202.0f)
                lineTo(32.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(224.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(144.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 146.25f)
                lineToRelative(15.42f, -17.62f)
                lineTo(194.82f, 179.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.19f, 3.0f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.0f, -0.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.16f, -8.2f)
                lineTo(173.76f, 119.1f)
                lineTo(204.52f, 84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.0f, -7.9f)
                lineTo(150.0f, 128.0f)
                lineTo(150.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 74.0f)
                close()
                moveTo(90.0f, 176.0f)
                lineTo(90.0f, 158.0f)
                lineTo(40.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.74f, -9.68f)
                lineToRelative(56.0f, -72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 80.0f)
                verticalLineToRelative(66.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(102.0f, 158.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(90.0f, 146.0f)
                lineTo(90.0f, 97.49f)
                lineTo(52.27f, 146.0f)
                close()
            }
        }
        .build()
        return _fourK!!
    }

private var _fourK: ImageVector? = null
