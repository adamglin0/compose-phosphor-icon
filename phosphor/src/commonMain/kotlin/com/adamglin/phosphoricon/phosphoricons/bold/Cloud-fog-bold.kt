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

public val BoldGroup.`Cloud-fog-bold`: ImageVector
    get() {
        if (`_cloud-fog-bold` != null) {
            return `_cloud-fog-bold`!!
        }
        `_cloud-fog-bold` = Builder(name = "Cloud-fog-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(184.0f, 184.0f)
                lineTo(160.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(160.0f, 220.0f)
                lineTo(104.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(232.0f, 96.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(76.0f, 172.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 85.0f, 68.78f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 232.0f, 96.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveToRelative(0.0f, -1.24f, 0.0f, -2.48f, 0.09f, -3.71f)
                arcTo(29.28f, 29.28f, 0.0f, false, false, 76.0f, 92.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 56.0f)
                horizontalLineToRelative(80.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 208.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_cloud-fog-bold`!!
    }

private var `_cloud-fog-bold`: ImageVector? = null
