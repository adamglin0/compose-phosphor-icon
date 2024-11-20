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

public val DuotoneGroup.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = Builder(name = "SkipForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(196.3f, 134.65f)
                lineTo(68.19f, 214.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 208.12f)
                verticalLineTo(47.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.19f, -6.65f)
                lineTo(196.3f, 121.35f)
                arcTo(7.83f, 7.83f, 0.0f, false, true, 196.3f, 134.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(69.23f)
                lineTo(72.43f, 34.45f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 48.0f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 24.43f, 13.43f)
                lineTo(192.0f, 146.77f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 32.0f)
                close()
                moveTo(64.0f, 207.93f)
                verticalLineTo(48.05f)
                lineToRelative(127.84f, 80.0f)
                close()
            }
        }
        .build()
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
