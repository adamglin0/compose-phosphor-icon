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

public val ThinGroup.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) {
            return _smileyMelting!!
        }
        _smileyMelting = Builder(name = "SmileyMelting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 140.0f)
                close()
                moveTo(124.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 124.0f, 92.0f)
                close()
                moveTo(198.21f, 56.8f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 53.46f, 194.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.0f, -5.34f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 137.16f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 5.34f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 198.21f, 56.8f)
                close()
                moveTo(152.0f, 172.0f)
                lineTo(136.0f, 172.0f)
                curveToRelative(-12.0f, 0.0f, -25.28f, -4.92f, -35.42f, -13.16f)
                curveTo(89.89f, 150.15f, 84.0f, 139.19f, 84.0f, 128.0f)
                arcToRelative(43.89f, 43.89f, 0.0f, false, true, 0.61f, -7.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.89f, -1.32f)
                arcTo(52.17f, 52.17f, 0.0f, false, false, 76.0f, 128.0f)
                curveToRelative(0.0f, 29.29f, 32.25f, 52.0f, 60.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
