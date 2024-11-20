package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 111.0f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.9f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 111.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 137.05f)
                lineTo(128.0f, 198.79f)
                lineTo(20.0f, 137.05f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 12.0f, 151.0f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.94f, -13.9f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
