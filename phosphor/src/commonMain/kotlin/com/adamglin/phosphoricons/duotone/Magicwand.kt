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

public val DuotoneGroup.Magicwand: ImageVector
    get() {
        if (_magicwand != null) {
            return _magicwand!!
        }
        _magicwand = Builder(name = "Magicwand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 112.0f)
                lineTo(74.34f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(42.34f, 193.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(144.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(224.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 160.0f)
                lineTo(192.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 152.0f)
                close()
                moveTo(56.0f, 72.0f)
                lineTo(72.0f, 72.0f)
                lineTo(72.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 72.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 56.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(72.0f, 56.0f)
                lineTo(56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(184.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(219.31f, 80.0f)
                lineTo(80.0f, 219.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineTo(36.68f, 198.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f)
                lineTo(176.0f, 36.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(20.68f, 20.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 219.31f, 80.0f)
                close()
                moveTo(164.68f, 112.0f)
                lineTo(144.0f, 91.31f)
                lineToRelative(-96.0f, 96.0f)
                lineTo(68.68f, 208.0f)
                close()
                moveTo(208.0f, 68.69f)
                lineTo(187.31f, 48.0f)
                lineToRelative(-32.0f, 32.0f)
                lineTo(176.0f, 100.69f)
                close()
            }
        }
        .build()
        return _magicwand!!
    }

private var _magicwand: ImageVector? = null
