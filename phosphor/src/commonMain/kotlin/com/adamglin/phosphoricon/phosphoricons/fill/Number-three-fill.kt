package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Number-three-fill`: ImageVector
    get() {
        if (`_number-three-fill` != null) {
            return `_number-three-fill`!!
        }
        `_number-three-fill` = Builder(name = "Number-three-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(124.0f, 192.0f)
                arcToRelative(43.85f, 43.85f, 0.0f, false, true, -34.22f, -16.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.44f, -10.06f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 126.0f, 120.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.58f, -13.1f)
                lineToRelative(22.48f, -27.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.15f, 13.12f)
                lineToRelative(-25.23f, 30.27f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 124.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_number-three-fill`!!
    }

private var `_number-three-fill`: ImageVector? = null
