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

public val FillGroup.`Rainbow-cloud-fill`: ImageVector
    get() {
        if (`_rainbow-cloud-fill` != null) {
            return `_rainbow-cloud-fill`!!
        }
        `_rainbow-cloud-fill` = Builder(name = "Rainbow-cloud-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 160.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f)
                lineTo(152.0f, 208.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -14.75f, -32.0f, -32.89f)
                reflectiveCurveToRelative(14.35f, -32.89f, 32.0f, -32.89f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, 3.34f, 0.18f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 248.0f, 160.0f)
                close()
                moveTo(112.0f, 72.0f)
                arcToRelative(87.57f, 87.57f, 0.0f, false, true, 61.35f, 24.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.5f, 85.44f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 8.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 160.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 112.0f, 72.0f)
                close()
                moveTo(112.0f, 104.0f)
                arcToRelative(55.58f, 55.58f, 0.0f, false, true, 33.13f, 10.84f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 154.6f, 102.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 40.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 160.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 112.0f, 104.0f)
                close()
                moveTo(127.21f, 130.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, -9.63f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 29.57f, -23.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 127.21f, 130.71f)
                close()
            }
        }
        .build()
        return `_rainbow-cloud-fill`!!
    }

private var `_rainbow-cloud-fill`: ImageVector? = null
