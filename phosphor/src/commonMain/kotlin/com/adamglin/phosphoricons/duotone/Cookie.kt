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

public val DuotoneGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.49f, 163.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.49f, 163.51f)
                close()
                moveTo(83.49f, 155.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 83.51f, 155.51f)
                close()
                moveTo(92.49f, 116.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.49f, 116.49f)
                close()
                moveTo(140.49f, 115.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.49f, 115.51f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(215.69f, 135.39f)
                arcTo(56.13f, 56.13f, 0.0f, false, true, 168.5f, 87.5f)
                arcToRelative(56.13f, 56.13f, 0.0f, false, true, -47.89f, -47.19f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 95.08f, 95.08f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
