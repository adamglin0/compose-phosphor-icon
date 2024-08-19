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

public val BoldGroup.Bugdroid: ImageVector
    get() {
        if (_bugdroid != null) {
            return _bugdroid!!
        }
        _bugdroid = Builder(name = "Bugdroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.35f, 51.62f)
                lineToRelative(11.14f, -11.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(179.34f, 35.69f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, false, -102.68f, 0.0f)
                lineTo(64.49f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(58.65f, 51.62f)
                arcTo(91.58f, 91.58f, 0.0f, false, false, 36.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                verticalLineTo(112.0f)
                arcTo(91.58f, 91.58f, 0.0f, false, false, 197.35f, 51.62f)
                close()
                moveTo(196.0f, 112.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(60.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                verticalLineTo(140.0f)
                horizontalLineTo(196.0f)
                verticalLineToRelative(12.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(140.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 88.0f)
                close()
                moveTo(84.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 84.0f, 88.0f)
                close()
            }
        }
        .build()
        return _bugdroid!!
    }

private var _bugdroid: ImageVector? = null
