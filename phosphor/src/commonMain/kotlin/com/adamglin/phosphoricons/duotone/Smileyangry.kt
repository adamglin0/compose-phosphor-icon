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

public val DuotoneGroup.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) {
            return _smileyAngry!!
        }
        _smileyAngry = Builder(name = "SmileyAngry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(92.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
                moveTo(164.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
                moveTo(171.56f, 81.34f)
                lineTo(128.0f, 110.39f)
                lineToRelative(-43.56f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.88f, 13.32f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, -13.32f)
                close()
                moveTo(156.43f, 177.34f)
                curveTo(148.0f, 171.73f, 139.94f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-20.0f, 3.73f, -28.43f, 9.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.86f, 13.32f)
                curveTo(114.93f, 186.34f, 120.0f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(13.07f, 2.34f, 19.57f, 6.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.86f, -13.32f)
                close()
            }
        }
        .build()
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
