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

public val DuotoneGroup.Addressbooktabs: ImageVector
    get() {
        if (_addressbooktabs != null) {
            return _addressbooktabs!!
        }
        _addressbooktabs = Builder(name = "Addressbooktabs", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(184.0f, 216.0f)
                lineTo(184.0f, 40.0f)
                close()
                moveTo(112.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 112.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(192.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                lineTo(192.0f, 152.0f)
                close()
                moveTo(208.0f, 88.0f)
                lineTo(192.0f, 88.0f)
                lineTo(192.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(48.0f, 48.0f)
                lineTo(176.0f, 48.0f)
                lineTo(176.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(192.0f, 208.0f)
                lineTo(192.0f, 168.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(151.75f, 166.0f)
                arcToRelative(39.76f, 39.76f, 0.0f, false, false, -17.19f, -23.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.12f, 0.0f)
                arcTo(39.84f, 39.84f, 0.0f, false, false, 72.25f, 166.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.5f, 4.0f)
                curveToRelative(2.64f, -10.25f, 13.06f, -18.0f, 24.25f, -18.0f)
                reflectiveCurveToRelative(21.62f, 7.73f, 24.25f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.5f, -4.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
            }
        }
        .build()
        return _addressbooktabs!!
    }

private var _addressbooktabs: ImageVector? = null
