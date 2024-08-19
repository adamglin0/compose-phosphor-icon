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

public val ThinGroup.`Compass-tool-thin`: ImageVector
    get() {
        if (`_compass-tool-thin` != null) {
            return `_compass-tool-thin`!!
        }
        `_compass-tool-thin` = Builder(name = "Compass-tool-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.56f, 121.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.12f, -3.64f)
                arcToRelative(84.05f, 84.05f, 0.0f, false, true, -38.58f, 37.16f)
                lineToRelative(-19.68f, -44.29f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 132.0f, 44.23f)
                lineTo(132.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 44.23f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -14.18f, 66.82f)
                lineTo(60.35f, 222.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 5.28f)
                arcTo(3.88f, 3.88f, 0.0f, false, false, 64.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -2.38f)
                lineToRelative(26.66f, -60.0f)
                arcTo(91.4f, 91.4f, 0.0f, false, false, 128.0f, 172.0f)
                arcToRelative(95.21f, 95.21f, 0.0f, false, false, 33.75f, -6.22f)
                lineToRelative(26.59f, 59.84f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 228.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, 1.62f, -0.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -5.28f)
                lineToRelative(-26.54f, -59.73f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 211.56f, 121.82f)
                close()
                moveTo(100.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 80.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(83.43f, 83.43f, 0.0f, false, true, -30.43f, -5.68f)
                lineToRelative(19.56f, -44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 21.74f, 0.0f)
                lineToRelative(19.63f, 44.15f)
                arcTo(87.44f, 87.44f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_compass-tool-thin`!!
    }

private var `_compass-tool-thin`: ImageVector? = null
