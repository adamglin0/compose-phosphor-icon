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

public val DuotoneGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(201.71f, 159.14f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -14.08f, 22.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.92f, -10.67f)
                arcToRelative(63.95f, 63.95f, 0.0f, false, false, 0.0f, -85.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.92f, -10.67f)
                arcToRelative(80.08f, 80.08f, 0.0f, false, true, 14.08f, 84.47f)
                close()
                moveTo(69.0f, 103.09f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 11.26f, 67.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.92f, 10.67f)
                arcToRelative(79.93f, 79.93f, 0.0f, false, true, 0.0f, -106.67f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 80.29f, 85.34f)
                arcTo(63.77f, 63.77f, 0.0f, false, false, 69.0f, 103.09f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(119.58f, 119.58f, 0.0f, false, true, -34.29f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.42f, -11.2f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 0.0f, -145.56f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 213.71f, 44.0f)
                arcTo(119.58f, 119.58f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(53.71f, 200.78f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 42.29f, 212.0f)
                arcToRelative(119.87f, 119.87f, 0.0f, false, true, 0.0f, -168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.42f, 11.2f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 0.0f, 145.56f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
