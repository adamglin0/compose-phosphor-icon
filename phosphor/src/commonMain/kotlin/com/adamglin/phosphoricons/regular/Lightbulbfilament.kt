package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) {
            return _lightbulbFilament!!
        }
        _lightbulbFilament = Builder(name = "LightbulbFilament", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, true, -33.64f, 69.21f)
                arcTo(16.24f, 16.24f, 0.0f, false, false, 176.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.23f, -12.66f)
                arcTo(87.59f, 87.59f, 0.0f, false, true, 40.0f, 104.5f)
                curveTo(39.74f, 56.83f, 78.26f, 17.15f, 125.88f, 16.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 104.0f)
                close()
                moveTo(200.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -73.74f, -72.0f)
                curveToRelative(-39.0f, 0.92f, -70.47f, 33.39f, -70.26f, 72.39f)
                arcToRelative(71.64f, 71.64f, 0.0f, false, false, 27.64f, 56.3f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 186.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 147.31f)
                lineTo(90.34f, 117.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(128.0f, 132.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(136.0f, 147.31f)
                lineTo(136.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(32.12f, 32.12f, 0.0f, false, true, 12.47f, -25.35f)
                arcTo(71.65f, 71.65f, 0.0f, false, false, 200.0f, 104.0f)
                close()
            }
        }
        .build()
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
