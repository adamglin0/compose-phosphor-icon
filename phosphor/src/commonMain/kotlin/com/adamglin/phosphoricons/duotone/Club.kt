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

public val DuotoneGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -88.07f, 26.44f)
                lineTo(160.0f, 224.0f)
                horizontalLineTo(96.0f)
                lineToRelative(16.07f, -53.56f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -23.9f, -71.65f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 79.66f, 0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 232.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 88.0f)
                curveToRelative(-0.78f, 0.0f, -1.56f, 0.0f, -2.33f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -107.34f, 0.0f)
                curveToRelative(-0.78f, 0.0f, -1.55f, 0.0f, -2.33f, 0.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 96.54f, 194.35f)
                lineToRelative(-8.2f, 27.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 232.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.66f, -10.3f)
                lineToRelative(-8.2f, -27.35f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 184.0f, 88.0f)
                close()
                moveTo(184.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -33.4f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.33f, 6.71f)
                lineToRelative(13.0f, 43.26f)
                horizontalLineToRelative(-42.5f)
                lineToRelative(13.0f, -43.26f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 105.4f, 166.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -19.93f, -59.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.33f, -12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 66.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.33f, 12.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 184.0f, 184.0f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
