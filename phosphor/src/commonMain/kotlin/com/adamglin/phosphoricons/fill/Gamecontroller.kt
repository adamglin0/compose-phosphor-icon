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

public val FillGroup.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.44f, 173.75f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.0f, -0.14f)
                lineTo(231.05f, 89.44f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, 0.0f, -0.18f)
                arcTo(60.08f, 60.08f, 0.0f, false, false, 172.0f, 40.0f)
                lineTo(83.89f, 40.0f)
                arcToRelative(59.88f, 59.88f, 0.0f, false, false, -59.0f, 49.52f)
                lineTo(8.58f, 173.61f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.0f, 0.14f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 60.9f, 31.71f)
                lineToRelative(0.35f, -0.37f)
                lineTo(109.52f, 160.0f)
                horizontalLineToRelative(37.0f)
                lineToRelative(39.71f, 45.09f)
                curveToRelative(0.11f, 0.13f, 0.23f, 0.25f, 0.35f, 0.37f)
                arcTo(36.08f, 36.08f, 0.0f, false, false, 212.0f, 216.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.43f, -42.25f)
                close()
                moveTo(104.0f, 112.0f)
                lineTo(96.0f, 112.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(80.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(144.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(152.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 104.0f)
                close()
                moveTo(228.37f, 191.47f)
                arcToRelative(19.84f, 19.84f, 0.0f, false, true, -12.9f, 8.23f)
                arcTo(20.09f, 20.09f, 0.0f, false, true, 198.0f, 194.31f)
                lineTo(167.8f, 160.0f)
                lineTo(172.0f, 160.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 51.0f, -28.38f)
                lineToRelative(8.74f, 45.0f)
                arcTo(19.82f, 19.82f, 0.0f, false, true, 228.37f, 191.47f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
