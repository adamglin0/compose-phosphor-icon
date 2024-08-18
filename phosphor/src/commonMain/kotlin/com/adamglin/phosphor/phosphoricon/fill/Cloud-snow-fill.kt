package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Cloud-snow-fill`: ImageVector
    get() {
        if (`_cloud-snow-fill` != null) {
            return `_cloud-snow-fill`!!
        }
        `_cloud-snow-fill` = Builder(name = "Cloud-snow-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 196.0f)
                close()
                moveTo(116.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 200.0f)
                close()
                moveTo(164.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 184.0f)
                close()
                moveTo(68.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 224.0f)
                close()
                moveTo(156.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 224.0f)
                close()
                moveTo(231.87f, 87.55f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -151.78f, 0.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 72.0f, 96.0f)
                lineToRelative(-0.6f, 0.0f)
                arcTo(8.14f, 8.14f, 0.0f, false, true, 64.0f, 87.39f)
                arcToRelative(92.48f, 92.48f, 0.0f, false, true, 2.33f, -16.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -4.78f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 24.0f, 116.36f)
                curveTo(24.2f, 145.07f, 48.12f, 168.0f, 76.84f, 168.0f)
                lineTo(156.0f, 168.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 231.87f, 87.55f)
                close()
            }
        }
        .build()
        return `_cloud-snow-fill`!!
    }

private var `_cloud-snow-fill`: ImageVector? = null
