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

public val DuotoneGroup.Userswitch: ImageVector
    get() {
        if (_userswitch != null) {
            return _userswitch!!
        }
        _userswitch = Builder(name = "Userswitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.76f, 95.76f, 0.0f, false, true, -31.8f, 71.37f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -64.2f, 39.37f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.66f, 133.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(216.0f, 132.69f)
                lineTo(216.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 56.49f, 76.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, -9.34f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 128.0f)
                verticalLineToRelative(4.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(212.48f, 188.66f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 24.0f, 128.0f)
                verticalLineToRelative(-4.69f)
                lineTo(13.66f, 133.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.34f, 122.34f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(40.0f, 123.31f)
                lineTo(40.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f)
                arcTo(79.66f, 79.66f, 0.0f, false, true, 98.3f, 157.66f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f)
                arcToRelative(79.59f, 79.59f, 0.0f, false, true, 36.08f, 28.78f)
                arcToRelative(89.68f, 89.68f, 0.0f, false, false, 5.71f, -7.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.34f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.2f, 88.2f, 0.0f, false, false, 53.92f, -18.49f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.84f, 0.0f)
                arcTo(87.57f, 87.57f, 0.0f, false, false, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _userswitch!!
    }

private var _userswitch: ImageVector? = null
