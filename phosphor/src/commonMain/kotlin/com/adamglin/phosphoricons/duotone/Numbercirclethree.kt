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

public val DuotoneGroup.Numbercirclethree: ImageVector
    get() {
        if (_numbercirclethree != null) {
            return _numbercirclethree!!
        }
        _numbercirclethree = Builder(name = "Numbercirclethree", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -61.71f, 25.19f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 109.71f, 166.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 124.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.55f, -12.59f)
                lineTo(136.63f, 92.0f)
                lineTo(104.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.55f, 12.59f)
                lineToRelative(-21.0f, 30.0f)
                arcTo(36.07f, 36.07f, 0.0f, false, true, 160.0f, 152.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _numbercirclethree!!
    }

private var _numbercirclethree: ImageVector? = null
