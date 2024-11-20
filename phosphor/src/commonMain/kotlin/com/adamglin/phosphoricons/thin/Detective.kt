package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 116.0f)
                lineTo(218.0f, 116.0f)
                lineTo(169.35f, 49.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.0f, -0.51f)
                lineTo(137.45f, 63.38f)
                lineToRelative(-0.1f, 0.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.7f, 0.0f)
                lineToRelative(-0.1f, -0.12f)
                lineTo(105.66f, 48.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.0f, 0.51f)
                lineTo(38.0f, 116.0f)
                lineTo(8.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(248.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(93.13f, 53.65f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.26f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 1.5f)
                lineToRelative(0.1f, 0.12f)
                lineToRelative(12.89f, 14.94f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 128.0f, 76.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 15.55f, -7.44f)
                lineToRelative(12.89f, -14.94f)
                lineToRelative(0.1f, -0.12f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 3.2f, -1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.13f, 1.65f)
                lineTo(208.15f, 116.0f)
                lineTo(47.85f, 116.0f)
                close()
                moveTo(180.0f, 148.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                lineTo(108.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -1.0f, 8.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 31.0f, -40.0f)
                close()
                moveTo(76.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 76.0f, 204.0f)
                close()
                moveTo(180.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 180.0f, 204.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
