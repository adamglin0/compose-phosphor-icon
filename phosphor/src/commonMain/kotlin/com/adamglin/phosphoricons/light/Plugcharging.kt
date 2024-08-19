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

public val LightGroup.Plugcharging: ImageVector
    get() {
        if (_plugcharging != null) {
            return _plugcharging!!
        }
        _plugcharging = Builder(name = "Plugcharging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 58.0f)
                lineTo(174.0f, 58.0f)
                lineTo(174.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(162.0f, 58.0f)
                lineTo(94.0f, 58.0f)
                lineTo(94.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(82.0f, 58.0f)
                lineTo(32.55f, 58.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 26.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(50.0f, 70.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 198.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(206.0f, 70.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(194.0f, 160.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(88.0f, 186.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(62.0f, 70.0f)
                lineTo(194.0f, 70.0f)
                close()
                moveTo(107.07f, 131.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.69f, -5.53f)
                lineToRelative(12.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.24f, 4.22f)
                lineToRelative(-9.0f, 23.89f)
                lineTo(144.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.62f, 8.11f)
                lineToRelative(-12.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.24f, -4.22f)
                lineToRelative(9.0f, -23.89f)
                lineTo(112.0f, 134.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 107.07f, 131.42f)
                close()
            }
        }
        .build()
        return _plugcharging!!
    }

private var _plugcharging: ImageVector? = null
