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

public val LightGroup.Skipforward: ImageVector
    get() {
        if (_skipforward != null) {
            return _skipforward!!
        }
        _skipforward = Builder(name = "Skipforward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(72.84f)
                lineTo(71.37f, 36.14f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.21f, -0.37f)
                arcTo(13.69f, 13.69f, 0.0f, false, false, 50.0f, 47.88f)
                lineTo(50.0f, 208.12f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, false, 7.16f, 12.11f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.21f, -0.37f)
                lineTo(194.0f, 143.17f)
                lineTo(194.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 34.0f)
                close()
                moveTo(193.12f, 129.56f)
                lineTo(65.0f, 209.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 0.05f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, -1.0f, -1.62f)
                lineTo(62.0f, 47.88f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, 1.0f, -1.62f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 64.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.31f)
                lineToRelative(128.12f, 80.13f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, 3.12f)
                close()
            }
        }
        .build()
        return _skipforward!!
    }

private var _skipforward: ImageVector? = null
