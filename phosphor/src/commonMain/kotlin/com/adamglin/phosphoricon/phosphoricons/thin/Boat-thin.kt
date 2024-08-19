package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Boat-thin`: ImageVector
    get() {
        if (`_boat-thin` != null) {
            return `_boat-thin`!!
        }
        `_boat-thin` = Builder(name = "Boat-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.79f, 114.38f)
                lineTo(204.0f, 109.12f)
                lineTo(204.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(132.0f, 44.0f)
                lineTo(132.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f)
                verticalLineToRelative(53.12f)
                lineToRelative(-15.8f, 5.26f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 125.77f)
                lineTo(28.0f, 152.0f)
                curveToRelative(0.0f, 24.46f, 17.32f, 46.77f, 50.09f, 64.52f)
                arcTo(233.22f, 233.22f, 0.0f, false, false, 127.0f, 235.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.94f, 0.0f)
                arcToRelative(233.22f, 233.22f, 0.0f, false, false, 48.94f, -19.36f)
                curveTo(210.68f, 198.77f, 228.0f, 176.46f, 228.0f, 152.0f)
                lineTo(228.0f, 125.77f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.79f, 114.38f)
                close()
                moveTo(60.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(50.45f)
                lineTo(129.26f, 84.21f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -2.52f, 0.0f)
                lineTo(60.0f, 106.45f)
                close()
                moveTo(220.0f, 152.0f)
                curveToRelative(0.0f, 49.32f, -82.08f, 73.16f, -92.0f, 75.86f)
                curveToRelative(-9.92f, -2.7f, -92.0f, -26.54f, -92.0f, -75.86f)
                lineTo(36.0f, 125.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.73f, -3.8f)
                lineTo(124.0f, 93.55f)
                lineTo(124.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 93.55f)
                lineTo(217.26f, 122.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.74f, 3.8f)
                close()
            }
        }
        .build()
        return `_boat-thin`!!
    }

private var `_boat-thin`: ImageVector? = null
