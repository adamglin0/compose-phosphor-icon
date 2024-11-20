package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.81f, 52.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.14f, 28.14f, 0.0f, false, false, -4.0f, 5.0f)
                lineTo(148.0f, 47.33f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 100.2f, 28.19f)
                horizontalLineToRelative(0.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 94.7f, 60.0f)
                lineTo(54.58f, 96.1f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -34.39f, 4.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 36.7f, 42.12f)
                lineToRelative(76.75f, 56.28f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 46.17f, -10.39f)
                arcToRelative(27.66f, 27.66f, 0.0f, false, false, -3.33f, -2.84f)
                lineTo(206.63f, 100.0f)
                quadToRelative(0.69f, 0.0f, 1.38f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 19.8f, -47.79f)
                close()
                moveTo(161.39f, 180.05f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -18.29f, 5.64f)
                lineTo(66.36f, 129.41f)
                arcTo(28.15f, 28.15f, 0.0f, false, false, 65.29f, 108.0f)
                lineToRelative(40.12f, -36.11f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 38.37f, -9.12f)
                lineTo(180.0f, 72.66f)
                arcToRelative(27.88f, 27.88f, 0.0f, false, false, 8.17f, 19.13f)
                arcToRelative(28.61f, 28.61f, 0.0f, false, false, 3.32f, 2.85f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
