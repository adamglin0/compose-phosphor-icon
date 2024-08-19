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

public val ThinGroup.`Cloud-moon-thin`: ImageVector
    get() {
        if (`_cloud-moon-thin` != null) {
            return `_cloud-moon-thin`!!
        }
        `_cloud-moon-thin` = Builder(name = "Cloud-moon-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 156.0f, 77.81f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -52.68f, -64.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.79f, 4.8f)
                arcToRelative(60.05f, 60.05f, 0.0f, false, true, -72.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 4.8f)
                arcTo(68.2f, 68.2f, 0.0f, false, false, 56.17f, 140.1f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 92.0f, 220.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(31.22f, 99.44f)
                arcTo(69.46f, 69.46f, 0.0f, false, false, 40.0f, 100.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                arcToRelative(69.74f, 69.74f, 0.0f, false, false, -0.56f, -8.79f)
                arcTo(59.66f, 59.66f, 0.0f, false, true, 148.0f, 80.0f)
                verticalLineToRelative(0.11f)
                arcToRelative(72.27f, 72.27f, 0.0f, false, false, -44.49f, 45.28f)
                arcTo(48.28f, 48.28f, 0.0f, false, false, 92.0f, 124.0f)
                arcToRelative(47.75f, 47.75f, 0.0f, false, false, -29.61f, 10.26f)
                arcTo(60.21f, 60.21f, 0.0f, false, true, 31.22f, 99.44f)
                close()
                moveTo(172.0f, 212.0f)
                horizontalLineTo(92.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f)
                arcTo(71.63f, 71.63f, 0.0f, false, false, 100.0f, 143.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f)
                arcToRelative(64.3f, 64.3f, 0.0f, false, true, 2.0f, -12.67f)
                curveToRelative(0.0f, -0.12f, 0.07f, -0.24f, 0.09f, -0.36f)
                arcTo(64.06f, 64.06f, 0.0f, true, true, 172.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_cloud-moon-thin`!!
    }

private var `_cloud-moon-thin`: ImageVector? = null
