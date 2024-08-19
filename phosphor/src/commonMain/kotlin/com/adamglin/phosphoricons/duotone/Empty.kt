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

public val DuotoneGroup.Empty: ImageVector
    get() {
        if (_empty != null) {
            return _empty!!
        }
        _empty = Builder(name = "Empty", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -88.0f, -88.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.24f, 62.63f)
                lineToRelative(15.68f, -17.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f)
                lineTo(186.4f, 51.86f)
                arcTo(95.95f, 95.95f, 0.0f, false, false, 57.76f, 193.37f)
                lineTo(42.08f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f)
                lineTo(69.6f, 204.14f)
                arcTo(95.95f, 95.95f, 0.0f, false, false, 198.24f, 62.63f)
                close()
                moveTo(48.0f, 128.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 175.6f, 63.75f)
                lineToRelative(-107.0f, 117.73f)
                arcTo(79.63f, 79.63f, 0.0f, false, true, 48.0f, 128.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(79.55f, 79.55f, 0.0f, false, true, -47.6f, -15.75f)
                lineToRelative(107.0f, -117.73f)
                arcTo(79.95f, 79.95f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
        }
        .build()
        return _empty!!
    }

private var _empty: ImageVector? = null
