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

public val DuotoneGroup.Exclude: ImageVector
    get() {
        if (_exclude != null) {
            return _exclude!!
        }
        _exclude = Builder(name = "Exclude", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 160.0f)
                arcToRelative(73.37f, 73.37f, 0.0f, false, false, 0.4f, 7.6f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 79.2f, -79.2f)
                arcTo(73.37f, 73.37f, 0.0f, false, false, 160.0f, 88.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 160.0f)
                close()
                moveTo(167.6f, 88.4f)
                arcTo(73.37f, 73.37f, 0.0f, false, true, 168.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, 72.0f)
                arcToRelative(73.37f, 73.37f, 0.0f, false, true, -7.6f, -0.4f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 79.2f, -79.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.37f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 126.0f, -16.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 80.05f, 158.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 160.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _exclude!!
    }

private var _exclude: ImageVector? = null
