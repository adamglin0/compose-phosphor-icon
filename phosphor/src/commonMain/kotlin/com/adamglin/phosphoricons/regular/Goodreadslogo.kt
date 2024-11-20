package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) {
            return _goodreadsLogo!!
        }
        _goodreadsLogo = Builder(name = "GoodreadsLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(45.74f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 112.0f, 42.26f)
                verticalLineTo(168.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f)
                curveToRelative(-16.45f, 0.0f, -32.72f, -8.08f, -41.44f, -20.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.12f, 9.16f)
                curveTo(85.06f, 221.24f, 106.48f, 232.0f, 128.0f, 232.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 24.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
