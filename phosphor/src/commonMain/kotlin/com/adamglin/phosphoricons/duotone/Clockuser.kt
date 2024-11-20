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

public val DuotoneGroup.ClockUser: ImageVector
    get() {
        if (_clockUser != null) {
            return _clockUser!!
        }
        _clockUser = Builder(name = "ClockUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.6f, 95.6f, 0.0f, false, true, -9.09f, 40.82f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 191.5f, 200.0f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(33.15f, 33.15f, 0.0f, false, false, -29.0f, 17.6f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 72.0f)
                verticalLineToRelative(43.05f)
                lineToRelative(36.42f, -18.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 14.31f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(231.73f, 221.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.46f, 4.11f)
                curveTo(213.44f, 215.42f, 203.46f, 208.0f, 192.0f, 208.0f)
                reflectiveCurveToRelative(-21.44f, 7.42f, -24.27f, 18.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 232.0f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.06f, -0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.67f, -9.79f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 17.11f, -23.32f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.23f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 231.73f, 221.94f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 176.0f)
                close()
            }
        }
        .build()
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
