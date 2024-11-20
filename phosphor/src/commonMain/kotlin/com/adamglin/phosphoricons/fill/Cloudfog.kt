package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) {
            return _cloudFog!!
        }
        _cloudFog = Builder(name = "CloudFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(104.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 232.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 200.0f)
                close()
                moveTo(184.0f, 192.0f)
                lineTo(160.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(231.87f, 95.55f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -151.78f, 0.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 72.0f, 104.0f)
                lineToRelative(-0.6f, 0.0f)
                arcTo(8.14f, 8.14f, 0.0f, false, true, 64.0f, 95.39f)
                arcToRelative(92.48f, 92.48f, 0.0f, false, true, 2.33f, -16.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -4.78f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 24.0f, 124.36f)
                curveTo(24.2f, 153.07f, 48.12f, 176.0f, 76.84f, 176.0f)
                lineTo(156.0f, 176.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 231.87f, 95.55f)
                close()
            }
        }
        .build()
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
