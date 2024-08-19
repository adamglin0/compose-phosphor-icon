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

public val BoldGroup.`Cloud-warning-bold`: ImageVector
    get() {
        if (`_cloud-warning-bold` != null) {
            return `_cloud-warning-bold`!!
        }
        `_cloud-warning-bold` = Builder(name = "Cloud-warning-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 36.0f)
                arcTo(92.09f, 92.09f, 0.0f, false, false, 79.0f, 84.36f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 72.0f, 220.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 0.0f, -184.0f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -1.82f, -88.0f)
                arcTo(91.86f, 91.86f, 0.0f, false, false, 68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                close()
                moveTo(148.0f, 120.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(176.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_cloud-warning-bold`!!
    }

private var `_cloud-warning-bold`: ImageVector? = null
