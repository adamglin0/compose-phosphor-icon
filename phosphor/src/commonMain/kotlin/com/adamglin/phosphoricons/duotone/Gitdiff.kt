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

public val DuotoneGroup.Gitdiff: ImageVector
    get() {
        if (_gitdiff != null) {
            return _gitdiff!!
        }
        _gitdiff = Builder(name = "Gitdiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 56.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 64.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 200.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(28.69f)
                lineTo(66.34f, 151.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 145.37f)
                lineTo(64.0f, 95.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(50.38f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.0f, 17.0f)
                lineTo(92.69f, 200.0f)
                lineTo(64.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 152.0f)
                close()
                moveTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 56.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f)
                close()
                moveTo(208.0f, 161.0f)
                lineTo(208.0f, 110.63f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, -7.0f, -17.0f)
                lineTo(163.31f, 56.0f)
                lineTo(192.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 67.31f)
                lineTo(189.66f, 105.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, 5.66f)
                lineTo(192.0f, 161.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _gitdiff!!
    }

private var _gitdiff: ImageVector? = null
