package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.46f, 33.55f)
                arcToRelative(25.81f, 25.81f, 0.0f, false, false, -36.49f, 0.0f)
                lineTo(19.76f, 207.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.89f, 10.09f)
                arcTo(158.88f, 158.88f, 0.0f, false, false, 58.39f, 222.0f)
                curveToRelative(32.57f, 0.0f, 65.17f, -10.1f, 95.87f, -29.91f)
                curveToRelative(31.49f, -20.32f, 49.72f, -43.39f, 50.48f, -44.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.49f, -7.94f)
                lineTo(182.49f, 118.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(25.86f, 25.86f, 0.0f, false, false, 230.46f, 33.55f)
                close()
                moveTo(191.86f, 144.37f)
                arcTo(221.0f, 221.0f, 0.0f, false, true, 147.75f, 182.0f)
                curveTo(111.5f, 205.4f, 74.0f, 214.23f, 36.23f, 208.32f)
                lineTo(146.0f, 98.5f)
                close()
                moveTo(222.0f, 61.56f)
                lineToRelative(-48.0f, 48.0f)
                lineTo(154.49f, 90.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 222.0f, 61.56f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
