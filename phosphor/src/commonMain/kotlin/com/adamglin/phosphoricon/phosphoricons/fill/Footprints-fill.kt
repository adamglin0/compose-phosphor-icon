package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Footprints-fill`: ImageVector
    get() {
        if (`_footprints-fill` != null) {
            return `_footprints-fill`!!
        }
        `_footprints-fill` = Builder(name = "Footprints-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.06f, 192.0f)
                verticalLineToRelative(12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 144.0f, 204.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.06f, 192.0f)
                close()
                moveTo(104.0f, 160.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 112.0f, 180.0f)
                lineTo(112.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 160.0f)
                close()
                moveTo(76.0f, 16.0f)
                curveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, 2.93f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f)
                curveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f)
                close()
                moveTo(154.8f, 168.0f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f)
                curveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f)
                reflectiveCurveToRelative(-22.89f, 10.31f, -31.77f, 29.0f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 154.76f, 168.0f)
                close()
            }
        }
        .build()
        return `_footprints-fill`!!
    }

private var `_footprints-fill`: ImageVector? = null
