package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(76.0f, 48.0f)
                lineTo(76.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 64.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 176.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                lineTo(232.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 48.0f)
                close()
                moveTo(36.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 52.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(88.0f)
                lineTo(48.0f, 140.0f)
                arcToRelative(35.59f, 35.59f, 0.0f, false, false, -12.0f, 2.06f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(64.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(76.0f, 72.0f)
                lineTo(220.0f, 72.0f)
                close()
                moveTo(104.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(180.0f, 136.0f)
                lineTo(180.0f, 124.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(180.0f, 100.0f)
                lineTo(180.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(140.0f, 100.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(104.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(140.0f, 124.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                lineTo(140.0f, 136.0f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
