package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Engine-fill`: ImageVector
    get() {
        if (`_engine-fill` != null) {
            return `_engine-fill`!!
        }
        `_engine-fill` = Builder(name = "Engine-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(227.31f)
                lineTo(192.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 180.69f, 224.0f)
                horizontalLineTo(103.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 92.0f, 219.31f)
                lineTo(52.69f, 180.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 48.0f, 168.69f)
                verticalLineTo(148.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 64.0f)
                horizontalLineToRelative(60.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(40.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 192.0f, 68.69f)
                lineTo(227.31f, 104.0f)
                horizontalLineTo(240.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_engine-fill`!!
    }

private var `_engine-fill`: ImageVector? = null
