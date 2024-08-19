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

public val DuotoneGroup.Userfocus: ImageVector
    get() {
        if (_userfocus != null) {
            return _userfocus!!
        }
        _userfocus = Builder(name = "Userfocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 112.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                lineTo(224.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                lineTo(180.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 40.0f)
                close()
                moveTo(216.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(28.0f)
                lineTo(180.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 180.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 172.0f)
                close()
                moveTo(76.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(76.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(48.0f, 48.0f)
                lineTo(76.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(32.0f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 84.0f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.41f, -3.19f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -83.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.62f)
                arcTo(67.94f, 67.94f, 0.0f, false, true, 101.0f, 141.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.94f, 0.0f)
                arcToRelative(67.94f, 67.94f, 0.0f, false, true, 27.43f, 21.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 176.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 128.0f, 136.0f)
                close()
            }
        }
        .build()
        return _userfocus!!
    }

private var _userfocus: ImageVector? = null
