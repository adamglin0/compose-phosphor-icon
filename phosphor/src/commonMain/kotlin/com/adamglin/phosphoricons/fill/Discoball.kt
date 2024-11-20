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

public val FillGroup.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) {
            return _discoBall!!
        }
        _discoBall = Builder(name = "DiscoBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 64.37f)
                lineTo(120.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(104.0f, 64.37f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(183.54f, 144.0f)
                lineTo(151.77f, 144.0f)
                curveToRelative(-1.51f, -28.36f, -10.79f, -48.36f, -19.44f, -61.06f)
                arcTo(72.16f, 72.16f, 0.0f, false, true, 183.54f, 144.0f)
                close()
                moveTo(135.76f, 160.0f)
                curveToRelative(-2.0f, 33.52f, -16.13f, 52.95f, -23.76f, 61.08f)
                curveToRelative(-7.64f, -8.15f, -21.77f, -27.57f, -23.76f, -61.08f)
                close()
                moveTo(91.67f, 82.94f)
                curveTo(83.0f, 95.64f, 73.74f, 115.64f, 72.23f, 144.0f)
                lineTo(40.46f, 144.0f)
                arcTo(72.16f, 72.16f, 0.0f, false, true, 91.67f, 82.94f)
                close()
                moveTo(40.46f, 160.0f)
                lineTo(72.23f, 160.0f)
                curveToRelative(1.51f, 28.36f, 10.79f, 48.36f, 19.44f, 61.06f)
                arcTo(72.16f, 72.16f, 0.0f, false, true, 40.46f, 160.0f)
                close()
                moveTo(256.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(224.0f, 96.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(224.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 88.0f)
                close()
                moveTo(152.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(176.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(192.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(192.0f, 48.0f)
                lineTo(192.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(176.0f, 48.0f)
                lineTo(160.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 40.0f)
                close()
            }
        }
        .build()
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
