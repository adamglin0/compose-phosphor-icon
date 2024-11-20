package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 32.0f)
                lineTo(104.0f, 32.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 40.0f, 96.0f)
                lineTo(40.0f, 208.0f)
                lineTo(216.0f, 208.0f)
                lineTo(216.0f, 96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 152.0f, 32.0f)
                close()
                moveTo(176.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(80.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 80.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 96.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                lineTo(104.0f, 40.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 48.0f, 96.0f)
                lineTo(48.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 96.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, -72.0f)
                horizontalLineToRelative(48.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 224.0f, 96.0f)
                close()
                moveTo(184.0f, 96.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -19.29f, 23.53f)
                lineToRelative(2.45f, 4.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, 7.16f)
                lineTo(147.06f, 192.0f)
                lineTo(108.94f, 192.0f)
                lineToRelative(-5.78f, 11.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, -7.16f)
                lineToRelative(2.45f, -4.89f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 168.0f)
                lineTo(72.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 72.0f)
                horizontalLineToRelative(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 184.0f, 96.0f)
                close()
                moveTo(88.0f, 96.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                lineTo(168.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(96.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 96.0f)
                close()
                moveTo(120.0f, 160.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 160.0f)
                close()
                moveTo(96.0f, 176.0f)
                horizontalLineToRelative(8.0f)
                lineTo(104.0f, 160.0f)
                lineTo(88.0f, 160.0f)
                verticalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 176.0f)
                close()
                moveTo(168.0f, 168.0f)
                verticalLineToRelative(-8.0f)
                lineTo(152.0f, 160.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 168.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
