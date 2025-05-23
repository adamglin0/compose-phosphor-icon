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

public val DuotoneGroup.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) {
            return _projectorScreenChart!!
        }
        _projectorScreenChart = Builder(name = "ProjectorScreenChart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 72.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 144.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(136.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(160.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(168.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 152.0f)
                close()
                moveTo(216.0f, 80.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(136.0f, 192.0f)
                verticalLineToRelative(17.38f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(120.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(40.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 64.0f)
                lineTo(24.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 32.0f)
                lineTo(216.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(232.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 80.0f)
                close()
                moveTo(136.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 232.0f)
                close()
                moveTo(40.0f, 64.0f)
                lineTo(216.0f, 64.0f)
                lineTo(216.0f, 48.0f)
                lineTo(40.0f, 48.0f)
                close()
                moveTo(200.0f, 80.0f)
                lineTo(56.0f, 80.0f)
                verticalLineToRelative(96.0f)
                lineTo(200.0f, 176.0f)
                close()
            }
        }
        .build()
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
