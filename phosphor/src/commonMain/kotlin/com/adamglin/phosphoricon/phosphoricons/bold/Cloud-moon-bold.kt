package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Cloud-moon-bold`: ImageVector
    get() {
        if (`_cloud-moon-bold` != null) {
            return `_cloud-moon-bold`!!
        }
        `_cloud-moon-bold` = Builder(name = "Cloud-moon-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                curveToRelative(-1.66f, 0.0f, -3.31f, 0.06f, -4.95f, 0.16f)
                arcToRelative(75.93f, 75.93f, 0.0f, false, false, -58.0f, -62.23f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 94.68f, 20.31f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 32.3f, 82.68f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 17.93f, 97.07f)
                arcToRelative(76.61f, 76.61f, 0.0f, false, false, 27.91f, 43.27f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 92.0f, 228.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(119.89f, 36.0f)
                arcToRelative(51.64f, 51.64f, 0.0f, false, true, 23.68f, 37.17f)
                arcToRelative(80.39f, 80.39f, 0.0f, false, false, -45.18f, 43.15f)
                arcTo(56.5f, 56.5f, 0.0f, false, false, 92.0f, 116.0f)
                arcToRelative(55.69f, 55.69f, 0.0f, false, false, -28.23f, 7.66f)
                arcToRelative(52.69f, 52.69f, 0.0f, false, true, -15.63f, -15.77f)
                arcTo(76.11f, 76.11f, 0.0f, false, false, 119.89f, 36.0f)
                close()
                moveTo(172.0f, 204.0f)
                horizontalLineTo(92.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(-0.11f, 1.1f, -0.2f, 2.2f, -0.26f, 3.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 1.4f)
                arcToRelative(55.78f, 55.78f, 0.0f, false, true, 1.74f, -11.0f)
                lineToRelative(0.15f, -0.55f)
                arcTo(56.06f, 56.06f, 0.0f, true, true, 172.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_cloud-moon-bold`!!
    }

private var `_cloud-moon-bold`: ImageVector? = null
