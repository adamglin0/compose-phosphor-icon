package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.ShareFat: ImageVector
    get() {
        if (_shareFat != null) {
            return _shareFat!!
        }
        _shareFat = Builder(name = "ShareFat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 109.17f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 32.0f)
                verticalLineTo(76.09f)
                curveToRelative(-54.0f, 2.44f, -120.43f, 53.55f, -127.94f, 119.0f)
                arcToRelative(7.87f, 7.87f, 0.0f, false, false, 4.58f, 8.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.41f, 0.77f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.79f, -2.55f)
                horizontalLineToRelative(0.0f)
                curveToRelative(11.53f, -12.27f, 53.29f, -51.73f, 114.16f, -53.4f)
                verticalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.83f, 2.83f)
                lineToRelative(80.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 109.17f)
                close()
                moveTo(156.0f, 182.33f)
                verticalLineTo(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                curveToRelative(-27.39f, 0.0f, -54.08f, 7.17f, -79.34f, 21.3f)
                arcTo(189.91f, 189.91f, 0.0f, false, false, 28.0f, 196.0f)
                lineToRelative(2.92f, 2.74f)
                lineTo(28.0f, 196.0f)
                curveToRelative(3.36f, -29.21f, 19.55f, -57.48f, 45.6f, -79.57f)
                curveTo(97.53f, 96.11f, 126.83f, 84.0f, 152.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(41.66f)
                lineTo(226.34f, 112.0f)
                close()
            }
        }
        .build()
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
