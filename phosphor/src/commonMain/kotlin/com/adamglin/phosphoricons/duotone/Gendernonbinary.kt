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

public val DuotoneGroup.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) {
            return _genderNonbinary!!
        }
        _genderNonbinary = Builder(name = "GenderNonbinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 168.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 192.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 96.46f)
                verticalLineTo(62.13f)
                lineToRelative(27.88f, 16.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.24f, -13.72f)
                lineTo(143.55f, 48.0f)
                lineToRelative(28.57f, -17.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, -13.72f)
                lineTo(128.0f, 38.67f)
                lineTo(92.12f, 17.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 13.72f)
                lineTo(112.45f, 48.0f)
                lineTo(83.88f, 65.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f)
                lineTo(120.0f, 62.13f)
                verticalLineTo(96.46f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
