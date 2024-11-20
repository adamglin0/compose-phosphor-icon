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

public val DuotoneGroup.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = Builder(name = "Belt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 88.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(80.0f)
                lineTo(8.0f, 168.0f)
                close()
                moveTo(184.0f, 88.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(64.0f)
                lineTo(248.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 160.0f)
                lineTo(192.0f, 160.0f)
                lineTo(192.0f, 96.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(189.84f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 72.0f)
                lineTo(112.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.84f, 8.0f)
                lineTo(64.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(8.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 96.0f)
                lineTo(48.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(8.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(48.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(98.16f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 184.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.84f, -8.0f)
                lineTo(248.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(64.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 160.0f)
                close()
                moveTo(112.0f, 168.0f)
                lineTo(112.0f, 88.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                lineTo(144.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(31.8f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.13f, 0.0f, 0.2f)
                close()
            }
        }
        .build()
        return _belt!!
    }

private var _belt: ImageVector? = null
