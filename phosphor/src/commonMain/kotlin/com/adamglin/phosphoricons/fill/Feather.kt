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

public val FillGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.84f, 134.81f)
                lineToRelative(-59.79f, 60.47f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, true, -11.2f, 4.68f)
                horizontalLineTo(75.32f)
                lineTo(45.66f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(22.59f, -22.58f)
                horizontalLineToRelative(0.0f)
                lineTo(124.7f, 128.0f)
                horizontalLineTo(209.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.84f, 134.81f)
                close()
                moveTo(216.7f, 30.57f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -85.9f, 4.14f)
                lineToRelative(-9.6f, 9.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 47.0f)
                verticalLineToRelative(63.0f)
                lineToRelative(55.0f, -55.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 11.31f)
                lineTo(140.71f, 112.0f)
                horizontalLineToRelative(88.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.56f, -2.16f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 216.7f, 30.57f)
                close()
                moveTo(62.83f, 167.23f)
                lineTo(104.0f, 126.06f)
                verticalLineTo(70.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.81f, -2.84f)
                lineTo(60.69f, 104.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 56.0f, 115.31f)
                verticalLineTo(164.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 62.83f, 167.23f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
