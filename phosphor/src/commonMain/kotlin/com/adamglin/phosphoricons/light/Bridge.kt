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

public val LightGroup.Bridge: ImageVector
    get() {
        if (_bridge != null) {
            return _bridge!!
        }
        _bridge = Builder(name = "Bridge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 162.0f)
                lineTo(198.0f, 162.0f)
                lineTo(198.0f, 95.28f)
                arcToRelative(69.81f, 69.81f, 0.0f, false, false, 31.75f, 25.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 4.5f, -11.12f)
                arcTo(57.8f, 57.8f, 0.0f, false, true, 198.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 70.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(57.8f, 57.8f, 0.0f, false, true, -36.25f, 53.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 4.5f, 11.12f)
                arcTo(69.81f, 69.81f, 0.0f, false, false, 58.0f, 95.28f)
                lineTo(58.0f, 162.0f)
                lineTo(24.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 174.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 174.0f)
                lineTo(186.0f, 174.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(198.0f, 174.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(146.0f, 123.65f)
                lineTo(146.0f, 162.0f)
                lineTo(110.0f, 162.0f)
                lineTo(110.0f, 123.65f)
                arcToRelative(70.11f, 70.11f, 0.0f, false, false, 36.0f, 0.0f)
                close()
                moveTo(70.0f, 95.15f)
                arcToRelative(70.49f, 70.49f, 0.0f, false, false, 28.0f, 24.09f)
                lineTo(98.0f, 162.0f)
                lineTo(70.0f, 162.0f)
                close()
                moveTo(158.0f, 162.0f)
                lineTo(158.0f, 119.24f)
                arcToRelative(70.49f, 70.49f, 0.0f, false, false, 28.0f, -24.09f)
                lineTo(186.0f, 162.0f)
                close()
            }
        }
        .build()
        return _bridge!!
    }

private var _bridge: ImageVector? = null
