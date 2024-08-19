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

public val LightGroup.Spraybottle: ImageVector
    get() {
        if (_spraybottle != null) {
            return _spraybottle!!
        }
        _spraybottle = Builder(name = "Spraybottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f)
                horizontalLineTo(80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 66.0f, 32.0f)
                verticalLineTo(80.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 78.0f, 80.0f)
                verticalLineTo(78.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(26.62f)
                arcToRelative(25.87f, 25.87f, 0.0f, false, true, -9.76f, 20.3f)
                lineToRelative(-16.0f, 12.79f)
                arcTo(37.81f, 37.81f, 0.0f, false, false, 74.0f, 167.38f)
                verticalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(211.47f)
                arcTo(268.92f, 268.92f, 0.0f, false, false, 170.57f, 78.0f)
                close()
                moveTo(78.0f, 32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(42.06f, 42.06f, 0.0f, false, true, 41.57f, 36.0f)
                horizontalLineTo(78.0f)
                close()
                moveTo(194.0f, 211.47f)
                verticalLineTo(224.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(167.38f)
                arcToRelative(25.87f, 25.87f, 0.0f, false, true, 9.76f, -20.3f)
                lineToRelative(16.0f, -12.79f)
                arcTo(37.81f, 37.81f, 0.0f, false, false, 126.0f, 104.62f)
                verticalLineTo(78.0f)
                horizontalLineToRelative(30.64f)
                arcTo(256.84f, 256.84f, 0.0f, false, true, 194.0f, 211.47f)
                close()
            }
        }
        .build()
        return _spraybottle!!
    }

private var _spraybottle: ImageVector? = null
