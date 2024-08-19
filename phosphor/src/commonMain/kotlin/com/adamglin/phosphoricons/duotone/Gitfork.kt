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

public val DuotoneGroup.Gitfork: ImageVector
    get() {
        if (_gitfork != null) {
            return _gitfork!!
        }
        _gitfork = Builder(name = "Gitfork", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 64.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 88.0f, 64.0f)
                close()
                moveTo(192.0f, 40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 192.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -40.0f, 31.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(72.0f, 95.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(25.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(200.0f, 95.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 64.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 64.0f)
                close()
                moveTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 192.0f)
                close()
                moveTo(192.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 80.0f)
                close()
            }
        }
        .build()
        return _gitfork!!
    }

private var _gitfork: ImageVector? = null
