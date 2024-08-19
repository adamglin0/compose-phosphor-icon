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

public val FillGroup.`Crane-fill`: ImageVector
    get() {
        if (`_crane-fill` != null) {
            return `_crane-fill`!!
        }
        `_crane-fill` = Builder(name = "Crane-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.12f, 17.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.88f, -0.2f)
                lineTo(102.0f, 80.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(168.0f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, false, -0.08f, -1.05f)
                lineToRelative(0.0f, -0.24f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, -0.22f, -1.0f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.0f, -0.05f)
                verticalLineToRelative(0.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.0f, -0.07f)
                lineTo(113.54f, 92.0f)
                lineTo(216.0f, 37.33f)
                verticalLineTo(160.0f)
                horizontalLineTo(200.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.12f, 17.14f)
                close()
                moveTo(48.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(32.0f, 200.0f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(176.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return `_crane-fill`!!
    }

private var `_crane-fill`: ImageVector? = null
