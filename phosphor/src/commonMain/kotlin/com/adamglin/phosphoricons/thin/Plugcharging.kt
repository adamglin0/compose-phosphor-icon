package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Plugcharging: ImageVector
    get() {
        if (_plugcharging != null) {
            return _plugcharging!!
        }
        _plugcharging = Builder(name = "Plugcharging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 60.0f)
                lineTo(172.0f, 60.0f)
                lineTo(172.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(164.0f, 60.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(84.0f, 60.0f)
                lineTo(32.55f, 60.0f)
                curveTo(28.13f, 60.0f, 28.0f, 63.59f, 28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(52.0f, 68.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 196.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(204.0f, 68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(196.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(88.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(60.0f, 68.0f)
                lineTo(196.0f, 68.0f)
                close()
                moveTo(108.71f, 130.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.46f, -3.68f)
                lineToRelative(12.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.5f, 2.8f)
                lineToRelative(-10.0f, 26.6f)
                lineTo(144.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.75f, 5.4f)
                lineToRelative(-12.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.5f, -2.8f)
                lineToRelative(10.0f, -26.6f)
                lineTo(112.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.71f, 130.28f)
                close()
            }
        }
        .build()
        return _plugcharging!!
    }

private var _plugcharging: ImageVector? = null
