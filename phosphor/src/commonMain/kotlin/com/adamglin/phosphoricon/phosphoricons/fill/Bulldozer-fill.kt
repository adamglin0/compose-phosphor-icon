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

public val FillGroup.`Bulldozer-fill`: ImageVector
    get() {
        if (`_bulldozer-fill` != null) {
            return `_bulldozer-fill`!!
        }
        `_bulldozer-fill` = Builder(name = "Bulldozer-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 200.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(199.2f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -33.71f, -31.61f)
                lineTo(129.44f, 49.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 114.67f, 40.0f)
                horizontalLineTo(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 56.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, 64.0f)
                horizontalLineTo(160.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, 39.2f, -32.0f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(64.0f, 56.0f)
                horizontalLineToRelative(50.67f)
                lineTo(148.0f, 136.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(24.0f, 56.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(40.0f)
                arcToRelative(39.72f, 39.72f, 0.0f, false, false, -16.0f, 3.35f)
                close()
                moveTo(160.0f, 184.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_bulldozer-fill`!!
    }

private var `_bulldozer-fill`: ImageVector? = null
